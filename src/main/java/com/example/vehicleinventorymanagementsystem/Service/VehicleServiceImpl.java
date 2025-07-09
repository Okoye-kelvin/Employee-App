package com.example.vehicleinventorymanagementsystem.Service;

package com.example.vehiclemanagement.service.impl;

import com.example.vehiclemanagement.model.Vehicle;
import com.example.vehiclemanagement.repository.VehicleRepository;
import com.example.vehiclemanagement.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        if (vehicleRepository.existsByRegistrationNumber(vehicle.getRegistrationNumber())) {
            throw new IllegalArgumentException("Vehicle with this registration number already exists");
        }
        return vehicleRepository.save(vehicle);
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        Optional<Vehicle> optional = vehicleRepository.findById(id);
        return optional.orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    @Override
    public void deleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }
}
