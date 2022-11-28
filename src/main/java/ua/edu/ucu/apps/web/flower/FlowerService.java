package ua.edu.ucu.apps.web.flower;

import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    public Flower getFlowerExample(){
        return new Flower(FlowerColor.BLUE, 50, 100);
    }
}
