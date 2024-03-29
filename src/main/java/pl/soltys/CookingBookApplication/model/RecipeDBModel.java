/* (C)2023 */
package pl.soltys.CookingBookApplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "recipe")
public class RecipeDBModel {
  @Id
  @Column(name = "API_ID")
  private Integer API_ID;

  @Column(name = "Name")
  private String name;

  @Column(name = "Description")
  private String description;

  @Column(name = "PictureURL")
  private String pictureURL;
}
