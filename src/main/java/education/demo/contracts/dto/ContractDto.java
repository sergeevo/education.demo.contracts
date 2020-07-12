package education.demo.contracts.dto;

import java.time.Instant;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@JsonDeserialize(builder = ContractDto.ContractDtoBuilder.class)
public class ContractDto {
    private final String id;

    private final String title;

    private final String text;

    private final List<String> signees;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX", timezone = "UTC")
    private final Instant dateCreated;

    @JsonPOJOBuilder(withPrefix = "")
    public static class ContractDtoBuilder {

    }
}
