package store.data.models;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Vendor {
    private String storeNumber;
    private Set<String> storeAddress = new HashSet<>();
}
