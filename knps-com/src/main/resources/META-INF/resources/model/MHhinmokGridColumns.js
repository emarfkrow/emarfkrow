/**
 * 販売品目マスタグリッド定義
 */

let MHhinmokGridColumns = [
    Column.cell('HHINBAN', Messages['MHhinmokGrid.hhinban'], 200, 'primaryKey', null),
    Column.text('LVCD', Messages['MHhinmokGrid.lvcd'], 20, '', null),
    Column.check('DLTFLG', Messages['MHhinmokGrid.dltflg'], 10, ''),
    Column.text('HINCD', Messages['MHhinmokGrid.hincd'], 200, '', null),
    Column.text('HINMEI', Messages['MHhinmokGrid.hinmei'], 100, '', null),
    Column.select('SETKBN', Messages['MHhinmokGrid.setkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SSHINKBN', Messages['MHhinmokGrid.sshinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('JUKINKBN', Messages['MHhinmokGrid.jukinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('TENKINKBN', Messages['MHhinmokGrid.tenkinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('NYUKOKINKBN', Messages['MHhinmokGrid.nyukokinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SEIHINKBN', Messages['MHhinmokGrid.seihinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SIJIKBN', Messages['MHhinmokGrid.sijikbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SHOHIN-BUNRUI', Messages['MHhinmokGrid.shohinBunrui'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('KIJUNZAIKO', Messages['MHhinmokGrid.kijunzaiko'], 70, '', null),
    Column.text('SEI-TANJU', Messages['MHhinmokGrid.seiTanju'], 70, '', null),
    Column.text('LOCATIONNO', Messages['MHhinmokGrid.locationno'], 100, '', null),
    Column.text('HOSOCD', Messages['MHhinmokGrid.hosocd'], 20, '', null),
    Column.text('HOSOTANI', Messages['MHhinmokGrid.hosotani'], 70, '', null),
    Column.text('HOSOKEPIN', Messages['MHhinmokGrid.hosokepin'], 10, '', null),
    Column.select('KONPOKBN', Messages['MHhinmokGrid.konpokbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('KLKBN', Messages['MHhinmokGrid.klkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('JISKBN', Messages['MHhinmokGrid.jiskbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('SETKIJUNH', Messages['MHhinmokGrid.setkijunh'], 40, '', null),
    Column.text('KIMATU-GENKA', Messages['MHhinmokGrid.kimatuGenka'], 70, '', null),
    Column.text('HYOJUN-GENKA', Messages['MHhinmokGrid.hyojunGenka'], 70, '', null),
    Column.text('NIJI-GENKA', Messages['MHhinmokGrid.nijiGenka'], 70, '', null),
    Column.text('HYOJUN-BAIKA', Messages['MHhinmokGrid.hyojunBaika'], 70, '', null),
    Column.date('TOUROKUBI', Messages['MHhinmokGrid.tourokubi'], 80, '', null),
    Column.date('HATUBAIBI', Messages['MHhinmokGrid.hatubaibi'], 80, '', null),
    Column.select('TOJITUKBN', Messages['MHhinmokGrid.tojitukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('SIN-SEIHIN-BUNRUI', Messages['MHhinmokGrid.sinSeihinBunrui'], 20, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('DTEIBANKBN', Messages['MHhinmokGrid.dteibankbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('ZAIJUCKBN', Messages['MHhinmokGrid.zaijuckbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('STANTOCD', Messages['MHhinmokGrid.stantocd'], 30, '', null),
    Column.select('TORIFUKBN', Messages['MHhinmokGrid.torifukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('PRDENDKBN', Messages['MHhinmokGrid.prdendkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('BUNRUI4', Messages['MHhinmokGrid.bunrui4'], 20, '', null),
    Column.select('ZAISHUKBN', Messages['MHhinmokGrid.zaishukbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('BARCODE', Messages['MHhinmokGrid.barcode'], 130, '', null),
    Column.check('DATA-FLG', Messages['MHhinmokGrid.dataFlg'], 10, ''),
    Column.text('UPCCD', Messages['MHhinmokGrid.upccd'], 120, '', null),
    Column.text('ZAIKOSU-H1', Messages['MHhinmokGrid.zaikosuH1'], 70, '', null),
    Column.text('ZAIKOSU-H2', Messages['MHhinmokGrid.zaikosuH2'], 70, '', null),
    Column.text('ZAIKOSU-H3', Messages['MHhinmokGrid.zaikosuH3'], 70, '', null),
    Column.text('ZAIKOSU-H4', Messages['MHhinmokGrid.zaikosuH4'], 70, '', null),
    Column.text('ZAIKOSU-H5', Messages['MHhinmokGrid.zaikosuH5'], 70, '', null),
    Column.text('SIJISU-H1', Messages['MHhinmokGrid.sijisuH1'], 70, '', null),
    Column.text('SIJISU-H2', Messages['MHhinmokGrid.sijisuH2'], 70, '', null),
    Column.text('SIJISU-H3', Messages['MHhinmokGrid.sijisuH3'], 70, '', null),
    Column.text('SIJISU-H4', Messages['MHhinmokGrid.sijisuH4'], 70, '', null),
    Column.text('HIKIATE-H1', Messages['MHhinmokGrid.hikiateH1'], 70, '', null),
    Column.text('HIKIATE-H2', Messages['MHhinmokGrid.hikiateH2'], 70, '', null),
    Column.text('HIKIATE-H3', Messages['MHhinmokGrid.hikiateH3'], 70, '', null),
    Column.text('HIKIATE-H4', Messages['MHhinmokGrid.hikiateH4'], 70, '', null),
    Column.text('SCHUZANSU1', Messages['MHhinmokGrid.schuzansu1'], 70, '', null),
    Column.text('SCHUZANSU2', Messages['MHhinmokGrid.schuzansu2'], 70, '', null),
    Column.text('SCHUZANSU3', Messages['MHhinmokGrid.schuzansu3'], 70, '', null),
    Column.text('UCHUZANSU1', Messages['MHhinmokGrid.uchuzansu1'], 70, '', null),
    Column.text('UCHUZANSU2', Messages['MHhinmokGrid.uchuzansu2'], 70, '', null),
    Column.text('UCHUZANSU3', Messages['MHhinmokGrid.uchuzansu3'], 70, '', null),
    Column.text('DCHUZANSU1', Messages['MHhinmokGrid.dchuzansu1'], 70, '', null),
    Column.text('DCHUZANSU2', Messages['MHhinmokGrid.dchuzansu2'], 70, '', null),
    Column.text('DCHUZANSU3', Messages['MHhinmokGrid.dchuzansu3'], 70, '', null),
    Column.text('NYUKOYOTE-H1', Messages['MHhinmokGrid.nyukoyoteH1'], 70, '', null),
    Column.text('NYUKOYOTE-H2', Messages['MHhinmokGrid.nyukoyoteH2'], 70, '', null),
    Column.text('NYUKOYOTE-H3', Messages['MHhinmokGrid.nyukoyoteH3'], 70, '', null),
    Column.text('NYUKOYOTE-H4', Messages['MHhinmokGrid.nyukoyoteH4'], 70, '', null),
    Column.text('SAPPOROZAIKO', Messages['MHhinmokGrid.sapporozaiko'], 70, '', null),
    Column.text('SENDAIZAIKO', Messages['MHhinmokGrid.sendaizaiko'], 70, '', null),
    Column.text('TOKYOZAIKO', Messages['MHhinmokGrid.tokyozaiko'], 70, '', null),
    Column.text('KANTOZAIKO', Messages['MHhinmokGrid.kantozaiko'], 70, '', null),
    Column.text('KANAZAWAZAIKO', Messages['MHhinmokGrid.kanazawazaiko'], 70, '', null),
    Column.text('NAGOYAZAIKO', Messages['MHhinmokGrid.nagoyazaiko'], 70, '', null),
    Column.text('KINKIZAIKO', Messages['MHhinmokGrid.kinkizaiko'], 70, '', null),
    Column.text('HIROSIMAZAIKO', Messages['MHhinmokGrid.hirosimazaiko'], 70, '', null),
    Column.text('FUKUOKAZAIKO', Messages['MHhinmokGrid.fukuokazaiko'], 70, '', null),
    Column.text('GYOMUZAIKO', Messages['MHhinmokGrid.gyomuzaiko'], 70, '', null),
    Column.text('BOEKIZAIKO', Messages['MHhinmokGrid.boekizaiko'], 70, '', null),
    Column.text('HITECZAIKO', Messages['MHhinmokGrid.hiteczaiko'], 70, '', null),
    Column.text('BOEKIITAKU', Messages['MHhinmokGrid.boekiitaku'], 70, '', null),
    Column.text('SKTCHSZAIKO', Messages['MHhinmokGrid.sktchszaiko'], 70, '', null),
    Column.text('HOSOZAIKO', Messages['MHhinmokGrid.hosozaiko'], 70, '', null),
    Column.date('SENDYOTEIBI', Messages['MHhinmokGrid.sendyoteibi'], 80, '', null),
    Column.date('SENDBI', Messages['MHhinmokGrid.sendbi'], 80, '', null),
    Column.text('HINCDALT1', Messages['MHhinmokGrid.hincdalt1'], 200, '', null),
    Column.text('HINCDALT2', Messages['MHhinmokGrid.hincdalt2'], 200, '', null),
    Column.select('NOUKIFUKAKBN', Messages['MHhinmokGrid.noukifukakbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.select('CHOKUHINKBN', Messages['MHhinmokGrid.chokuhinkbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
    Column.text('KOKUSAICD', Messages['MHhinmokGrid.kokusaicd'], 10, '', null),
    Column.text('KUNICD', Messages['MHhinmokGrid.kunicd'], 20, '', null),
    Column.select('CHOKUKAKBN', Messages['MHhinmokGrid.chokukakbn'], 10, '', { json: 'MstCodeValueSearch.json', paramkey: 'code_nm', value: 'CODE_VALUE', label: 'CODE_VALUE_MEI' }),
];
