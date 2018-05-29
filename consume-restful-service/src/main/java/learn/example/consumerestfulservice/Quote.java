package learn.example.consumerestfulservice;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

// JsonIgnoreProperties 转换实体时忽略json中不存在的字段
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    private @Setter @Getter String type;
    private @Setter @Getter Value value;

    @Override
    public String toString() {
        return "Quote{" +
                "type='" + type + '\'' +
                ", value=" + value +
                '}';
    }
}
