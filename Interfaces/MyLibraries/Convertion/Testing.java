package MyLibraries.Convertion;

public class Testing {
    public static void main(String[] args) {
    String path  = "Interfaces/MyLibraries/Convertion/db_design.xml";
    WriteXmlToJava wxtj = new WriteXmlToJava();
    wxtj.ConvertFromXml2Java(path);
}
}