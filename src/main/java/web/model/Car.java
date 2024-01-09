package web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Car {

    private String model;

    private String series;


    @Override
    public String toString() {
        return "model=" + model +
                ", series=" + series;
    }
}
