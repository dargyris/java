package org.example;

public class L_Button {
    private String title;
    private IClickLlistener clickListener;

    public L_Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setClickListener(IClickLlistener clickListener) {
        this.clickListener = clickListener;
    }

    public void onClick() {
        this.clickListener.onClick(this.title);
    }

    public interface IClickLlistener {
        public void onClick(String title);
    }

}
