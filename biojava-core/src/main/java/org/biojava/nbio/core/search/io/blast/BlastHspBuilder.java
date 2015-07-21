/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.biojava.nbio.core.search.io.blast;


public class BlastHspBuilder {
    private int hspNum;
    private double hspBitScore;
    private int hspScore;
    private double hspEvalue;
    private int hspQueryFrom;
    private int hspQueryTo;
    private int hspHitFrom;
    private int hspHitTo;
    private int hspQueryFrame;
    private int hspHitFrame;
    private int hspIdentity;
    private int hspPositive;
    private int hspGaps;
    private int hspAlignLen;
    private String hspQseq;
    private String hspHseq;
    private String hspIdentityString;

    public BlastHspBuilder() {
    }

    public BlastHspBuilder setHspNum(int hspNum) {
        this.hspNum = hspNum;
        return this;
    }

    public BlastHspBuilder setHspBitScore(double hspBitScore) {
        this.hspBitScore = hspBitScore;
        return this;
    }

    public BlastHspBuilder setHspScore(int hspScore) {
        this.hspScore = hspScore;
        return this;
    }

    public BlastHspBuilder setHspEvalue(double hspEvalue) {
        this.hspEvalue = hspEvalue;
        return this;
    }

    public BlastHspBuilder setHspQueryFrom(int hspQueryFrom) {
        this.hspQueryFrom = hspQueryFrom;
        return this;
    }

    public BlastHspBuilder setHspQueryTo(int hspQueryTo) {
        this.hspQueryTo = hspQueryTo;
        return this;
    }

    public BlastHspBuilder setHspHitFrom(int hspHitFrom) {
        this.hspHitFrom = hspHitFrom;
        return this;
    }

    public BlastHspBuilder setHspHitTo(int hspHitTo) {
        this.hspHitTo = hspHitTo;
        return this;
    }

    public BlastHspBuilder setHspQueryFrame(int hspQueryFrame) {
        this.hspQueryFrame = hspQueryFrame;
        return this;
    }

    public BlastHspBuilder setHspHitFrame(int hspHitFrame) {
        this.hspHitFrame = hspHitFrame;
        return this;
    }

    public BlastHspBuilder setHspIdentity(int hspIdentity) {
        this.hspIdentity = hspIdentity;
        return this;
    }

    public BlastHspBuilder setHspPositive(int hspPositive) {
        this.hspPositive = hspPositive;
        return this;
    }

    public BlastHspBuilder setHspGaps(int hspGaps) {
        this.hspGaps = hspGaps;
        return this;
    }

    public BlastHspBuilder setHspAlignLen(int hspAlignLen) {
        this.hspAlignLen = hspAlignLen;
        return this;
    }

    public BlastHspBuilder setHspQseq(String hspQseq) {
        this.hspQseq = hspQseq;
        return this;
    }

    public BlastHspBuilder setHspHseq(String hspHseq) {
        this.hspHseq = hspHseq;
        return this;
    }

    public BlastHspBuilder setHspIdentityString(String hspIdentityString) {
        this.hspIdentityString = hspIdentityString;
        return this;
    }

    public BlastHsp createBlastHsp() {
        return new BlastHsp(hspNum, hspBitScore, hspScore, hspEvalue, hspQueryFrom, hspQueryTo, hspHitFrom, hspHitTo, hspQueryFrame, hspHitFrame, hspIdentity, hspPositive, hspGaps, hspAlignLen, hspQseq, hspHseq, hspIdentityString);
    }
    
}