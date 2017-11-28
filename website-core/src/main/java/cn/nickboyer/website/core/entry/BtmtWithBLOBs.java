package cn.nickboyer.website.core.entry;

public class BtmtWithBLOBs extends Btmt {
    private byte[] content;

    private byte[] contentDescription;

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public byte[] getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(byte[] contentDescription) {
        this.contentDescription = contentDescription;
    }
}