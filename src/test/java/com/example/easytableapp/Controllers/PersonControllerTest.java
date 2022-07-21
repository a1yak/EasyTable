package com.example.easytableapp.Controllers;

import com.example.easytableapp.Models.Person;
import com.example.easytableapp.Models.Reservation;
import com.example.easytableapp.Service.PersonService;
import com.example.easytableapp.Service.ReservationService;
import com.example.easytableapp.repositories.PersonRepository;
import com.example.easytableapp.repositories.ReservationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import java.beans.PropertyEditor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;


class PersonControllerTest {

    @Test
    public void newPersonShouldReturnMappingOfAdding() {
        PersonController controller = new PersonController(new PersonService(new PersonRepository() {
            @Override
            public List<Person> findAll() {
                return null;
            }

            @Override
            public List<Person> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Person> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Person> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Person> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Person> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Person getOne(Integer integer) {
                return null;
            }

            @Override
            public Person getById(Integer integer) {
                return null;
            }

            @Override
            public Person getReferenceById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Person> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Person> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Person> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Person> findById(Integer integer) {
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
            public void delete(Person entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Person> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Person> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Person> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Person> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        }), new ReservationService(new ReservationRepository() {
            @Override
            public Reservation findByReservationTime(LocalTime reservationTime) {
                return null;
            }

            @Override
            public Reservation findByReservationTimeAndReservationDateAndFoodPlaceId(LocalTime reservationTime, LocalDate reservationDate, int foodPlaceId) {
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
        }));
        Assertions.assertEquals("people/new", controller.newPerson(new Person("derek", "marek", "qwetf@gmail.com"), new Model() {
            @Override
            public Model addAttribute(String attributeName, Object attributeValue) {
                return null;
            }

            @Override
            public Model addAttribute(Object attributeValue) {
                return null;
            }

            @Override
            public Model addAllAttributes(Collection<?> attributeValues) {
                return null;
            }

            @Override
            public Model addAllAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public Model mergeAttributes(Map<String, ?> attributes) {
                return null;
            }

            @Override
            public boolean containsAttribute(String attributeName) {
                return false;
            }

            @Override
            public Object getAttribute(String attributeName) {
                return null;
            }

            @Override
            public Map<String, Object> asMap() {
                return null;
            }
        }, 12));

    }

    @Test
    public void addPeopleShouldReturnExceptionWhenWorkingWithNullPerson() {
        PersonController controller = new PersonController(new PersonService(new PersonRepository() {
            @Override
            public List<Person> findAll() {
                return null;
            }

            @Override
            public List<Person> findAll(Sort sort) {
                return null;
            }

            @Override
            public List<Person> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Person> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Person> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Person> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Person> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Person getOne(Integer integer) {
                return null;
            }

            @Override
            public Person getById(Integer integer) {
                return null;
            }

            @Override
            public Person getReferenceById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Person> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Person> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public Page<Person> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Person> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Person> findById(Integer integer) {
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
            public void delete(Person entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Person> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Person> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Person> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Person> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Person> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Person, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        }), new ReservationService(new ReservationRepository() {
            @Override
            public Reservation findByReservationTime(LocalTime reservationTime) {
                return null;
            }

            @Override
            public Reservation findByReservationTimeAndReservationDateAndFoodPlaceId(LocalTime reservationTime, LocalDate reservationDate, int foodPlaceId) {
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
        }));
        String response = "people/successfullreservation";
        Assertions.assertThrows(NullPointerException.class, () -> {
            controller.addPeople(new Person("reg", "dada", "ddd@gmail.ru"), new BindingResult() {
                @Override
                public Object getTarget() {
                    return null;
                }

                @Override
                public Map<String, Object> getModel() {
                    return null;
                }

                @Override
                public Object getRawFieldValue(String field) {
                    return null;
                }

                @Override
                public PropertyEditor findEditor(String field, Class<?> valueType) {
                    return null;
                }

                @Override
                public PropertyEditorRegistry getPropertyEditorRegistry() {
                    return null;
                }

                @Override
                public String[] resolveMessageCodes(String errorCode) {
                    return new String[0];
                }

                @Override
                public String[] resolveMessageCodes(String errorCode, String field) {
                    return new String[0];
                }

                @Override
                public void addError(ObjectError error) {

                }

                @Override
                public String getObjectName() {
                    return null;
                }

                @Override
                public void setNestedPath(String nestedPath) {

                }

                @Override
                public String getNestedPath() {
                    return null;
                }

                @Override
                public void pushNestedPath(String subPath) {

                }

                @Override
                public void popNestedPath() throws IllegalStateException {

                }

                @Override
                public void reject(String errorCode) {

                }

                @Override
                public void reject(String errorCode, String defaultMessage) {

                }

                @Override
                public void reject(String errorCode, Object[] errorArgs, String defaultMessage) {

                }

                @Override
                public void rejectValue(String field, String errorCode) {

                }

                @Override
                public void rejectValue(String field, String errorCode, String defaultMessage) {

                }

                @Override
                public void rejectValue(String field, String errorCode, Object[] errorArgs, String defaultMessage) {

                }

                @Override
                public void addAllErrors(Errors errors) {

                }

                @Override
                public boolean hasErrors() {
                    return false;
                }

                @Override
                public int getErrorCount() {
                    return 0;
                }

                @Override
                public List<ObjectError> getAllErrors() {
                    return null;
                }

                @Override
                public boolean hasGlobalErrors() {
                    return false;
                }

                @Override
                public int getGlobalErrorCount() {
                    return 0;
                }

                @Override
                public List<ObjectError> getGlobalErrors() {
                    return null;
                }

                @Override
                public ObjectError getGlobalError() {
                    return null;
                }

                @Override
                public boolean hasFieldErrors() {
                    return false;
                }

                @Override
                public int getFieldErrorCount() {
                    return 0;
                }

                @Override
                public List<FieldError> getFieldErrors() {
                    return null;
                }

                @Override
                public FieldError getFieldError() {
                    return null;
                }

                @Override
                public boolean hasFieldErrors(String field) {
                    return false;
                }

                @Override
                public int getFieldErrorCount(String field) {
                    return 0;
                }

                @Override
                public List<FieldError> getFieldErrors(String field) {
                    return null;
                }

                @Override
                public FieldError getFieldError(String field) {
                    return null;
                }

                @Override
                public Object getFieldValue(String field) {
                    return null;
                }

                @Override
                public Class<?> getFieldType(String field) {
                    return null;
                }
            }, new Model() {
                @Override
                public Model addAttribute(String attributeName, Object attributeValue) {
                    return null;
                }

                @Override
                public Model addAttribute(Object attributeValue) {
                    return null;
                }

                @Override
                public Model addAllAttributes(Collection<?> attributeValues) {
                    return null;
                }

                @Override
                public Model addAllAttributes(Map<String, ?> attributes) {
                    return null;
                }

                @Override
                public Model mergeAttributes(Map<String, ?> attributes) {
                    return null;
                }

                @Override
                public boolean containsAttribute(String attributeName) {
                    return false;
                }

                @Override
                public Object getAttribute(String attributeName) {
                    return null;
                }

                @Override
                public Map<String, Object> asMap() {
                    return null;
                }
            }, 23);
        });
    }

}