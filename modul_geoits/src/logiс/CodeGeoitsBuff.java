package logiс;



/**
 * Created with IntelliJ IDEA.
 * User: Shitov
 * Date: 14.09.15
 * Time: 3:23
 * To change this template use File | Settings | File Templates.
 */


public class CodeGeoitsBuff {
    private long id;
    private long codeId;
    private String code;
    private String shortNameRU;
    private String shortNameEN;
    private String nameRU;
    private String nameEN;
    private String codeStandartName;
    private String comments;
    private String codeNameRU;
    private String codeNameEN;
    private String typePlatform;

    public CodeGeoitsBuff(){
    }
    public CodeGeoitsBuff(int codeId, String code){
        this.codeId=codeId;
        this.code = code;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getCodeId() {
        return codeId;
    }

    public void setCodeId(long codeId) {
        this.codeId = codeId;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getShortNameRU() {
        return shortNameRU;
    }

    public void setShortNameRU(String shortNameRU) {
        this.shortNameRU = shortNameRU;
    }


    public String getShortNameEN() {
        return shortNameEN;
    }

    public void setShortNameEN(String shortNameEN) {
        this.shortNameEN = shortNameEN;
    }


    public String getNameRU() {
        return nameRU;
    }

    public void setNameRU(String nameRU) {
        this.nameRU = nameRU;
    }


    public String getNameEN() {
        return nameEN;
    }

    public void setNameEN(String nameEN) {
        this.nameEN = nameEN;
    }


    public String getCodeStandartName() {
        return codeStandartName;
    }

    public void setCodeStandartName(String codeStandartName) {
        this.codeStandartName = codeStandartName;
    }


    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }


    public String getCodeNameRU() {
        return codeNameRU;
    }

    public void setCodeNameRU(String codeNameRU) {
        this.codeNameRU = codeNameRU;
    }


    public String getCodeNameEN() {
        return codeNameEN;
    }

    public void setCodeNameEN(String codeNameEN) {
        this.codeNameEN = codeNameEN;
    }


    public String getTypePlatform() {
        return typePlatform;
    }

    public void setTypePlatform(String typePlatform) {
        this.typePlatform = typePlatform;
    }
}
