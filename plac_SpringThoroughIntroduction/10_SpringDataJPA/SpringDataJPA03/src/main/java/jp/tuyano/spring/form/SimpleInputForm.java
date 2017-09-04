package jp.tuyano.spring.form;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class SimpleInputForm {

   String name;
  String jobId;
  String[] favariteMovies;
  String fisrtMovie;
  String secondMovie;

}