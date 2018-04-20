package com.ali.trillium;

public class ValueSet {
    String sourceDate;
    String sourceIp;
    String sourceOperatingSystem;
    String destinationIp;
    String destinationPort;
    String destinationHope;
    String destinationLink;
    String sourcePort;
    String sourceSignature;
    String lineTailResult;

    public String getLineTailResult() {
        return lineTailResult;
    }

    public void setLineTailResult(String lineTailResult) {
        this.lineTailResult = lineTailResult;
    }

    public String getSourceSignature() {
        return sourceSignature;
    }

    public void setSourceSignature(String sourceSignature) {
        this.sourceSignature = sourceSignature;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public String getSourcePort() {
        return sourcePort;
    }

    public void setSourcePort(String sourcePort) {
        this.sourcePort = sourcePort;
    }

     public String getSourceDate() {
        return sourceDate;
    }

    public void setSourceDate(String sourceDate) {
        this.sourceDate = sourceDate;
    }

    public String getSourceIp() {
        return sourceIp;
    }

    public void setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
    }

    public String getSourceOperatingSystem() {
        return sourceOperatingSystem;
    }

    public void setSourceOperatingSystem(String sourceOperatingSystem) {
        this.sourceOperatingSystem = sourceOperatingSystem;
    }

    public String getDestinationIp() {
        return destinationIp;
    }

    public void setDestinationIp(String destinationIp) {
        this.destinationIp = destinationIp;
    }

    public String getDestinationHope() {
        return destinationHope;
    }

    public void setDestinationHope(String destinationHope) {
        this.destinationHope = destinationHope;
    }

    public String getDestinationLink() {
        return destinationLink;
    }

    public void setDestinationLink(String destinationLink) {
        this.destinationLink = destinationLink;
    }
}
