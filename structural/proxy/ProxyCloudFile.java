package structural.proxy;

public class ProxyCloudFile implements CloudFile {
    private String fileName;
    private RealCloudFile realFile;
    public ProxyCloudFile(String fileName) { this.fileName = fileName; }
    public void download() {
        if (realFile == null) realFile = new RealCloudFile(fileName);
        realFile.download();
    }
}
