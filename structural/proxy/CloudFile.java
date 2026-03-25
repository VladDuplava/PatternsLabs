package structural.proxy;

public interface CloudFile { void download(); }

class RealCloudFile implements CloudFile {
    private String fileName;
    public RealCloudFile(String fileName) { this.fileName = fileName; loadFromServer(); }
    private void loadFromServer() { System.out.println("Heavy loading from Apple Server: " + fileName); }
    public void download() { System.out.println("Downloading " + fileName); }
}

