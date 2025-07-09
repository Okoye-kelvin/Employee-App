package com.example.vehicleinventorymanagementsystem.Service;

import com.example.vehicleinventorymanagementsystem.Domain.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle registerVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    void deleteVehicle(Long id);
}
