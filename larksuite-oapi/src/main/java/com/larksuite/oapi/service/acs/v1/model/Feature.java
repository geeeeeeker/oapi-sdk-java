// Code generated by lark suite oapi sdk gen
package com.larksuite.oapi.service.acs.v1.model;
import com.google.gson.annotations.SerializedName;

public class Feature {
    @SerializedName("card")
    private Integer card;
    @SerializedName("face_uploaded")
    private Boolean faceUploaded;

    public Integer getCard() {
        return this.card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

    public Boolean getFaceUploaded() {
        return this.faceUploaded;
    }

    public void setFaceUploaded(Boolean faceUploaded) {
        this.faceUploaded = faceUploaded;
    }

}