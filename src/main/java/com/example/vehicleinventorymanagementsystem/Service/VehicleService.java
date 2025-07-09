package com.example.vehicleinventorymanagementsystem.Service;

import com.example.vehiclemanagementsystem.Domain.Vehicle;
import java.util.List;

public interface VehicleService {
    Vehicle registerVehicle(Vehicle vehicle);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    void deleteVehicle(Long id);
}
