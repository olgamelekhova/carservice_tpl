package com.example.carservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarRentalService {
    /**
     * TODO: create list of cars
     * private List<Car> cars = new ArrayList<>();
    */

    public CarRentalService() {
        /**
         * TODO: add new cars to the list
         * cars.add(new Car(....));
         * cars.add(new Car(....));
        */
    }

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Car> getCars() {
        /*TODO: write your code here*/
        return null;
    }

    @RequestMapping(value = "/cars", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void addCar(@RequestBody Car car) {
        /*TODO: write your code here*/
    }

    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity<Car> rentCar(@PathVariable String plateNumber) {
        /*TODO: write your code here*/
        return null;
    }

    @RequestMapping(value = "/cars/{plateNumber}", method = RequestMethod.DELETE)
    @ResponseBody
    public ResponseEntity<Car> deleteCar(@PathVariable String plateNumber) {
        /*TODO: write your code here*/
        return null;
    }
}
