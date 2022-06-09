/**
 * ネプロス特約店マスタグリッド定義
 */

let MTokuyakGridColumns = [
    Column.cell('TOKUYAKUCD', Messages['MTokuyakGrid.tokuyakucd'], 80, 'primaryKey', null),
    Column.text('TOKUCD', Messages['MTokuyakGrid.tokucd'], 80, '', null),
    Column.text('HTOKUYAKUCD', Messages['MTokuyakGrid.htokuyakucd'], 80, '', null),
    Column.select('EIGYOKBN', Messages['MTokuyakGrid.eigyokbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('YURYOKUKBN', Messages['MTokuyakGrid.yuryokukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('GYOSHU-KBN', Messages['MTokuyakGrid.gyoshuKbn'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('RTOKUYAKUMEI', Messages['MTokuyakGrid.rtokuyakumei'], 200, '', null),
    Column.text('TOKUYAKUMEI1', Messages['MTokuyakGrid.tokuyakumei1'], 280, '', null),
    Column.text('TOKUYAKUMEI2', Messages['MTokuyakGrid.tokuyakumei2'], 220, '', null),
    Column.text('TOKUYAKU_JUSHO1', Messages['MTokuyakGrid.tokuyakuJusho1'], 280, '', null),
    Column.text('TOKUYAKU_JUSHO2', Messages['MTokuyakGrid.tokuyakuJusho2'], 220, '', null),
    Column.text('KTOKUYAKUMEI', Messages['MTokuyakGrid.ktokuyakumei'], 200, '', null),
    Column.text('UBINNO', Messages['MTokuyakGrid.ubinno'], 80, '', null),
    Column.text('TELNO', Messages['MTokuyakGrid.telno'], 120, '', null),
    Column.text('FAXNO', Messages['MTokuyakGrid.faxno'], 120, '', null),
    Column.date('TOUROKUBI', Messages['MTokuyakGrid.tourokubi'], 80, '', null),
    Column.select('TORIHIKI-KBN', Messages['MTokuyakGrid.torihikiKbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('KON_NPJUCHUKIN', Messages['MTokuyakGrid.konNpjuchukin'], 90, '', null),
    Column.text('KON_NPSHUKKA', Messages['MTokuyakGrid.konNpshukka'], 90, '', null),
    Column.text('ZEN_NPJUCHUKIN', Messages['MTokuyakGrid.zenNpjuchukin'], 90, '', null),
    Column.text('ZEN_NPSHUKKA', Messages['MTokuyakGrid.zenNpshukka'], 90, '', null),
    Column.text('SICHOCD', Messages['MTokuyakGrid.sichocd'], 60, '', null),
    Column.select('FAXKBN', Messages['MTokuyakGrid.faxkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('UNSOCD', Messages['MTokuyakGrid.unsocd'], 30, '', null),
    Column.text('TIKUCD', Messages['MTokuyakGrid.tikucd'], 10, '', null),
    Column.text('TODOFUKENCD', Messages['MTokuyakGrid.todofukencd'], 10, '', null),
    Column.text('FILLER', Messages['MTokuyakGrid.filler'], 80, '', null),
];
