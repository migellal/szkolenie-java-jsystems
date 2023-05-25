
package dzien4.web.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Usage {

    @SerializedName("prompt_tokens")
    @Expose
    private int promptTokens;
    @SerializedName("completion_tokens")
    @Expose
    private int completionTokens;
    @SerializedName("total_tokens")
    @Expose
    private int totalTokens;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Usage() {
    }

    /**
     * 
     * @param promptTokens
     * @param totalTokens
     * @param completionTokens
     */
    public Usage(int promptTokens, int completionTokens, int totalTokens) {
        super();
        this.promptTokens = promptTokens;
        this.completionTokens = completionTokens;
        this.totalTokens = totalTokens;
    }

    public int getPromptTokens() {
        return promptTokens;
    }

    public void setPromptTokens(int promptTokens) {
        this.promptTokens = promptTokens;
    }

    public int getCompletionTokens() {
        return completionTokens;
    }

    public void setCompletionTokens(int completionTokens) {
        this.completionTokens = completionTokens;
    }

    public int getTotalTokens() {
        return totalTokens;
    }

    public void setTotalTokens(int totalTokens) {
        this.totalTokens = totalTokens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Usage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("promptTokens");
        sb.append('=');
        sb.append(this.promptTokens);
        sb.append(',');
        sb.append("completionTokens");
        sb.append('=');
        sb.append(this.completionTokens);
        sb.append(',');
        sb.append("totalTokens");
        sb.append('=');
        sb.append(this.totalTokens);
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
        result = ((result* 31)+ this.promptTokens);
        result = ((result* 31)+ this.totalTokens);
        result = ((result* 31)+ this.completionTokens);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Usage) == false) {
            return false;
        }
        Usage rhs = ((Usage) other);
        return (((this.promptTokens == rhs.promptTokens)&&(this.totalTokens == rhs.totalTokens))&&(this.completionTokens == rhs.completionTokens));
    }

}
