package com.example.system_design.ddddemo.domain.channel.repository;

public interface Repository<E,D> {
    D getDO(E entity);
}
