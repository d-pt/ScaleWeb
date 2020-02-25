package local;

import java.io.Serializable;

public class SessionData implements Serializable {

    private String containerId;
    private String tag;

    public SessionData(String containerId, String tag) {
        this.containerId = containerId;
        this.tag = tag;
    }

    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    @Override
    public String toString() {
        return "{'" +
               containerId + "':'" + tag +
                "'}";
    }
}
