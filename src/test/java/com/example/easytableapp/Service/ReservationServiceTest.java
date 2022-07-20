package com.example.easytableapp.Service;

import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.repositories.ReservationRepository;
import org.junit.jupiter.api.Test;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class ReservationServiceTest {


    @Test
    void findByIdShouldReturnNullIfNotExists() {
        ReservationService service = new ReservationService(new ReservationRepository() {
            @Override
            public Reservation findByReservationTime(LocalTime reservationTime) {
                return null;
            }

            @Override
            public Reservation findByReservationTimeAndReservationDate(LocalTime reservationTime, LocalDate reservationDate) {
                return null;
            }

            @Override
            public List<Reservation> findAll() {
                return null;
            }

            @Override
            public List<Reservation> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Reservation> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Reservation> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Reservation> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Reservation> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Reservation> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Reservation getOne(Integer integer) {
                return null;
            }

            @Override
            public Reservation getById(Integer integer) {
                return null;
            }

            @Override
            public Reservation getReferenceById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Reservation> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Reservation> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Reservation> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Reservation> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Reservation> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Reservation entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Reservation> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Reservation> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Reservation> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Reservation> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Reservation> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Reservation, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        });
        assertEquals(null, service.findById(109));
    }

}