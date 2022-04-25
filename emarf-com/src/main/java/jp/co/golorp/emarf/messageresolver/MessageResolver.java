package jp.co.golorp.emarf.messageresolver;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.exceptions.TemplateProcessingException;
import org.thymeleaf.messageresolver.StandardMessageResolver;
import org.thymeleaf.templateresource.ITemplateResource;
import org.thymeleaf.util.StringUtils;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.util.Locales;

/**
 * @author toshiyuki
 *
 */
public class MessageResolver extends StandardMessageResolver {

    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(MessageResolver.class);

    /**
     *
     */
    private static final Map<String, String> EMPTY_MESSAGES = Collections.emptyMap();

    /**
     *
     */
    private static final String PROPERTIES_FILE_EXTENSION = ".properties";

    /**
     *
     */
    private static final int COMBINED_MESSAGES = 20;

    /**
     *
     */
    private static Map<Locale, Map<String, String>> localeMap = new HashMap<Locale, Map<String, String>>();

    /**
     * @param template
     * @param templateResource
     * @param locale
     * @return Map
     */
    protected Map<String, String> resolveMessagesForTemplate(final String template,
            final ITemplateResource templateResource, final Locale locale) {

        Map<String, String> map = localeMap.get(locale);
        if (map == null) {
            map = new HashMap<String, String>();
        }

        String path = getValue(templateResource, "path").toString();
        path = path.replaceFirst("S\\.html", ".html");
        setValue(templateResource, "path", path);

        Map<String, String> templateMap = super.resolveMessagesForTemplate(template, templateResource, locale);
        if (!templateMap.isEmpty()) {
            map.putAll(templateMap);
        }

        // プロジェクトでメンテするプロパティファイル
        Map<String, String> contextMap = getMessages();
        if (!contextMap.isEmpty()) {
            map.putAll(contextMap);
        }

        localeMap.put(locale, map);

        return map;
    }

    private static void setValue(final Object obj, final String name, final Object value) {
        try {
            Field field = getField(obj, name);
            field.set(obj, value);
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    private static Object getValue(final Object obj, final String name) {
        try {
            Field field = getField(obj, name);
            return field.get(obj);
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    private static Field getField(final Object obj, final String name) throws NoSuchFieldException {
        Field field = obj.getClass().getDeclaredField(name);
        field.setAccessible(true);
        return field;
    }

    /**
     * クラスパスのmessages.propertiesを読み込み
     *
     * @return Map
     */
    public static Map<String, String> getMessages() {

        Locale locale = Locales.get();

        Map<String, String> map = localeMap.get(locale);
        if (map != null && !map.isEmpty()) {
            return map;
        }

        String resourceBaseName = App.get("thymeleaf.messageresolver.basename");
        if (resourceBaseName == null || resourceBaseName.length() == 0) {
            return EMPTY_MESSAGES;
        }

        final List<String> messageResourceNames = computeMessageResourceNamesFromBase(resourceBaseName, locale);

        Map<String, String> combinedMessages = null;
        for (final String messageResourceName : messageResourceNames) {

            try {
                String baseName = messageResourceName.replaceFirst(".properties", "");
                ResourceBundle resourceBundle = ResourceBundle.getBundle(baseName, new UTF8Control());
                if (resourceBundle != null) {
                    if (combinedMessages == null) {
                        combinedMessages = new HashMap<String, String>(COMBINED_MESSAGES);
                    }
                    for (String propertyEntry : resourceBundle.keySet()) {
                        combinedMessages.put(propertyEntry, resourceBundle.getString(propertyEntry));
                    }
                }
            } catch (Exception e) {
                LOG.trace(e.getMessage());
            }
        }

        if (combinedMessages == null) {
            return EMPTY_MESSAGES;
        }

        return Collections.unmodifiableMap(combinedMessages);
    }

    /**
     * StandardMessageResolutionUtils.computeMessageResourceNamesFromBaseがprivateのため移植
     *
     * @param resourceBaseName
     * @param locale
     * @return List<String>
     */
    private static List<String> computeMessageResourceNamesFromBase(final String resourceBaseName,
            final Locale locale) {

        final List<String> resourceNames = new ArrayList<String>(5);

        if (StringUtils.isEmptyOrWhitespace(locale.getLanguage())) {
            throw new TemplateProcessingException(
                    "Locale \"" + locale.toString() + "\" " + "cannot be used as it does not specify a language.");
        }

        resourceNames.add(resourceBaseName + PROPERTIES_FILE_EXTENSION);
        resourceNames.add(resourceBaseName + "_" + locale.getLanguage() + PROPERTIES_FILE_EXTENSION);

        if (!StringUtils.isEmptyOrWhitespace(locale.getCountry())) {
            resourceNames.add(resourceBaseName + "_" + locale.getLanguage() + "_" + locale.getCountry()
                    + PROPERTIES_FILE_EXTENSION);
        }

        if (!StringUtils.isEmptyOrWhitespace(locale.getVariant())) {
            resourceNames.add(resourceBaseName + "_" + locale.getLanguage() + "_" + locale.getCountry() + "-"
                    + locale.getVariant() + PROPERTIES_FILE_EXTENSION);
        }

        return resourceNames;

    }

}
