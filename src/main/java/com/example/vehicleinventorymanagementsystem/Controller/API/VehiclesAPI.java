package com.example.vehicleinventorymanagementsystem.Controller.API;

import com.example.vehicleinventorymanagementsystem.Domain.Vehicle;
import com.example.vehicleinventorymanagementsystem.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class VehiclesAPI {

    @Autowired
    private VehicleService vehicleService;

    @RequestMapping("/vehicle")
    @GetMapping("/vehicle")
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        return ResponseEntity.ok().body(vehicleService.getAllVehicles());
    }

    @GetMapping("/vehicle/{id}")
    public ResponseEntity<Vehicle> getVehicleById(@PathVariable long id) {
        return ResponseEntity.ok().body(vehicleService.getVehicleById(id));
    }

    @PostMapping("/vehicle")
    public ResponseEntity<Vehicle> registerVehicle(@RequestBody Vehicle vehicle) {
        return ResponseEntity.ok().body(vehicleService.registerVehicle(vehicle));
    }

    @PutMapping("/vehicle/{id}")
    public ResponseEntity<Vehicle> updateVehicleRecord(@PathVariable long id, @RequestBody Vehicle vehicle) {
        // Note: The service currently doesn't take `id`, this is a placeholder
        return ResponseEntity.ok().body(vehicleService.registerVehicle(vehicle)); // Or update method if exists
    }

    @DeleteMapping("/vehicle/{id}")
    public HttpStatus deleteVehicle(@PathVariable long id) {
        vehicleService.deleteVehicle(id);
        return HttpStatus.OK;
    }
}
