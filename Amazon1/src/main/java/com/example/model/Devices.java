package com.example.model;

import java.util.List;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Devices {
	private List<Device>devices;
	private String brand;
}
