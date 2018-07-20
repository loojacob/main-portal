/**
 * 民族代码，GB/T 3304，中国各民族的罗马字母拼写法和代码，如“5”表示维吾尔族；特殊值“0”表示不能确定的少数民族
 * @author jacob
 *
 */
public enum EthicCodeTypeVO {
    HAN(1, "汉族"), ZHUANG(8, "壮族"), MAN(11, "满族"), HUI(3, "回族"), MIAO(6, "苗族"), 
    UYGUR(5, "维吾尔族"), YI(7, "彝族"), TUJIA(15, "土家族"), MONGOL(2, "蒙古族"), TIBETAN(4,"藏族"), 
    BUYEI(9, "布依族"), DONG(12, "侗族"), YAO(13, "瑶族"), KOREAN(10, "朝鲜族"), BAI(14, "白族"), 
    HANI(16, "哈尼族"), LI(19, "黎族"), KAZAK(17, "哈萨克族"), DAI(18, "傣族"), 
    SHE(22, "畲族"), LISU(20, "僳僳族"), GELAO(37, "仡佬族"), LAHU(24, "拉祜族"), 
    DONGXIANG(26, "东乡族"), VA(21, "佤族"), SUI(25, "水族"), NAXI(27, "纳西族"), QIANG(33, "羌族"), 
    TU(30, "土族"), XIBE(38, "锡伯族"), MULAO(32, "仫佬族"), KIRGIZ(29, "柯尔克孜族"), DAUR(31, "达斡尔族"), 
    JINGPO(28, "景颇族"), SALAR(35, "撒拉族"), BLANG(34, "布朗族"), MAONAN(36, "毛南族"), TAJIK(41, "塔吉克族"), 
    PUMI(40, "普米族"), ACHANG(39, "阿昌族"), NU(42, "怒族"), EWENKI(45, "鄂温克族"), GIN(49, "京族"), 
    JINO(56, "基诺族"), DEANG(46, "德昂族"), UZBEK(43, "乌孜别克族"), RUSS(44, "俄罗斯族"), YUGUR(48, "裕固族"), 
    BONAN(47, "保安族"), MONBA(54, "门巴族"), OROQEN(52, "鄂伦春族"), DERUNG(51, "独龙族"), TATAR(50, "塔塔尔族"), 
    HEZHEN(53, "赫哲族"), LHOBA(55, "珞巴族"), GAOSHAN(23, "高山族"), UNKNOWN(0, "不确定");

    // 枚举值
    private final int key;

    // 枚举描述
    private final String desc;

    private EthicCodeTypeVO(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public int getKey() {
        return key;
    }

    public String getDesc() {
        return desc;
    }

}
