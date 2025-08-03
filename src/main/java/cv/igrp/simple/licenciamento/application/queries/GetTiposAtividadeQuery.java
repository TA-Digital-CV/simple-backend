package cv.igrp.simple.licenciamento.application.queries;

import cv.igrp.framework.core.domain.Query;
import jakarta.validation.constraints.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTiposAtividadeQuery implements Query {

  @NotBlank(message = "The field <codigo> is required")
  private String codigo;
  @NotBlank(message = "The field <descricao> is required")
  private String descricao;
  @NotBlank(message = "The field <estado> is required")
  private String estado;
  @NotBlank(message = "The field <pagina> is required")
  private String pagina;
  @NotBlank(message = "The field <tamanho> is required")
  private String tamanho;

}