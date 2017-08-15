package jp.tuyano.spring.form;

import lombok.Data;

@Data
public class SimpleInputForm {
  String name;
  String[] favariteMovies;
  String fisrtMovie;
  String secondMovie;
}