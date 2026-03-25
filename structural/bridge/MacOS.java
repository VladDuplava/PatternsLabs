package structural.bridge;

interface OS { void run(); }
public class MacOS implements OS { public void run() { System.out.println("Running macOS Monterey"); } }

