package aermicioi.utils.selenide;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Config;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.SelectorMode;
import com.codeborne.selenide.impl.CiReportUrl;
import lombok.Setter;
import lombok.ToString;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.AssertionMode.STRICT;
import static com.codeborne.selenide.Browsers.CHROME;
import static com.codeborne.selenide.SelectorMode.CSS;

@Setter
@ToString
public class SelenideProperties implements Config {

    private final SelectorMode selectorMode = CSS;
    private final AssertionMode assertionMode = STRICT;

    private String browser = CHROME;
    private boolean headless = false;
    private String remote;
    private String browserSize = "1366x768";
    private String browserVersion;
    private String browserPosition;
    private boolean startMaximized = false;
    private boolean driverManagerEnabled = true;
    private String browserBinary = "";
    private String pageLoadStrategy = "normal";
    private DesiredCapabilities browserCapabilities = new DesiredCapabilities();

    private String baseUrl = "http://localhost:8080";
    private long timeout = 4000;
    private long pollingInterval = 200;
    private boolean holdBrowserOpen;
    private boolean reopenBrowserOnFail = true;
    private boolean clickViaJs = false;
    private boolean screenshots = true;

    private boolean savePageSource = true;
    private String reportsFolder = "build/reports/tests";
    private String reportsUrl;

    private boolean fastSetValue = false;
    private boolean versatileSetValue = false;

    private boolean proxyEnabled = false;
    private String proxyHost = "";
    private int proxyPort = 0;

    private FileDownloadMode fileDownload = FileDownloadMode.valueOf(FileDownloadMode.HTTPGET.name());

    public void setReportsUrl(String reportsUrl) {
        reportsUrl = new CiReportUrl().getReportsUrl(reportsUrl);
    }

    public void setFileDownload(String fileDownloadValue) {
        fileDownload = FileDownloadMode.valueOf(fileDownloadValue);
    }

    @Override
    public String browser() {
        return browser;
    }

    @Override
    public boolean headless() {
        return headless;
    }

    @Override
    public String remote() {
        return remote;
    }

    @Override
    public String browserSize() {
        return browserSize;
    }

    @Override
    public String browserVersion() {
        return browserVersion;
    }

    @Override
    public String browserPosition() {
        return browserPosition;
    }

    @Override
    public boolean startMaximized() {
        return startMaximized;
    }

    @Override
    public boolean driverManagerEnabled() {
        return driverManagerEnabled;
    }

    @Override
    public String browserBinary() {
        return browserBinary;
    }

    @Override
    public String pageLoadStrategy() {
        return pageLoadStrategy;
    }

    @Override
    public DesiredCapabilities browserCapabilities() {
        return browserCapabilities;
    }

    @Override
    public String baseUrl() {
        return baseUrl;
    }

    @Override
    public long timeout() {
        return timeout;
    }

    @Override
    public long pollingInterval() {
        return pollingInterval;
    }

    @Override
    public boolean holdBrowserOpen() {
        return holdBrowserOpen;
    }

    @Override
    public boolean reopenBrowserOnFail() {
        return reopenBrowserOnFail;
    }

    @Override
    public boolean clickViaJs() {
        return clickViaJs;
    }

    @Override
    public boolean screenshots() {
        return screenshots;
    }

    @Override
    public boolean savePageSource() {
        return savePageSource;
    }

    @Override
    public String reportsFolder() {
        return reportsFolder;
    }

    @Override
    public String reportsUrl() {
        return reportsUrl;
    }

    @Override
    public boolean fastSetValue() {
        return fastSetValue;
    }

    @Override
    public boolean versatileSetValue() {
        return versatileSetValue;
    }

    @Override
    public SelectorMode selectorMode() {
        return selectorMode;
    }

    @Override
    public AssertionMode assertionMode() {
        return assertionMode;
    }

    @Override
    public FileDownloadMode fileDownload() {
        return fileDownload;
    }

    @Override
    public boolean proxyEnabled() {
        return proxyEnabled;
    }

    @Override
    public String proxyHost() {
        return proxyHost;
    }

    @Override
    public int proxyPort() {
        return proxyPort;
    }
}
