
package dzien4.web.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Choice {

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("index")
    @Expose
    private int index;
    @SerializedName("logprobs")
    @Expose
    private Object logprobs;
    @SerializedName("finish_reason")
    @Expose
    private String finishReason;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Choice() {
    }

    /**
     * 
     * @param finishReason
     * @param index
     * @param text
     * @param logprobs
     */
    public Choice(String text, int index, Object logprobs, String finishReason) {
        super();
        this.text = text;
        this.index = index;
        this.logprobs = logprobs;
        this.finishReason = finishReason;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getLogprobs() {
        return logprobs;
    }

    public void setLogprobs(Object logprobs) {
        this.logprobs = logprobs;
    }

    public String getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(String finishReason) {
        this.finishReason = finishReason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Choice.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("text");
        sb.append('=');
        sb.append(((this.text == null)?"<null>":this.text));
        sb.append(',');
        sb.append("index");
        sb.append('=');
        sb.append(this.index);
        sb.append(',');
        sb.append("logprobs");
        sb.append('=');
        sb.append(((this.logprobs == null)?"<null>":this.logprobs));
        sb.append(',');
        sb.append("finishReason");
        sb.append('=');
        sb.append(((this.finishReason == null)?"<null>":this.finishReason));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.finishReason == null)? 0 :this.finishReason.hashCode()));
        result = ((result* 31)+ this.index);
        result = ((result* 31)+((this.text == null)? 0 :this.text.hashCode()));
        result = ((result* 31)+((this.logprobs == null)? 0 :this.logprobs.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Choice) == false) {
            return false;
        }
        Choice rhs = ((Choice) other);
        return (((((this.finishReason == rhs.finishReason)||((this.finishReason!= null)&&this.finishReason.equals(rhs.finishReason)))&&(this.index == rhs.index))&&((this.text == rhs.text)||((this.text!= null)&&this.text.equals(rhs.text))))&&((this.logprobs == rhs.logprobs)||((this.logprobs!= null)&&this.logprobs.equals(rhs.logprobs))));
    }

}
