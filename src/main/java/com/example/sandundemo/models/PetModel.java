package com.example.sandundemo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PetModel {
    private String id;
    private String name;
    private String tag;
}
