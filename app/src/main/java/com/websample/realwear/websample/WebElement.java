package com.websample.realwear.websample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Fin on 17/05/2017.
 */

public class WebElement {
    @SerializedName("Id")
    @Expose
    public String Id;

    @SerializedName("SpeechCommand")
    @Expose
    public String SpeechCommand;

    @SerializedName("top")
    @Expose
    public float Top;

    @SerializedName("right")
    @Expose
    public float Right;
}
