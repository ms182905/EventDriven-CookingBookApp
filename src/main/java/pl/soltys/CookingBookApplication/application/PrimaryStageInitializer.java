/* (C)2023 */
package pl.soltys.CookingBookApplication.application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import net.rgielen.fxweaver.core.FxWeaver;
import pl.soltys.CookingBookApplication.controller.RecipeListController;

@Component
public class PrimaryStageInitializer implements ApplicationListener<StageReadyEvent> {
  private final FxWeaver fxWeaver;

  @Autowired
  public PrimaryStageInitializer(FxWeaver fxWeaver) {
    this.fxWeaver = fxWeaver;
  }

  @Override
  public void onApplicationEvent(StageReadyEvent event) {
    Stage stage = event.stage;
    Scene scene = new Scene(fxWeaver.loadView(RecipeListController.class));
    stage.setScene(scene);
    stage.setResizable(false);
    stage.getIcons().add(new Image("file:src/main/resources/icon.png"));
    stage.setTitle("CookingBook Now!");
    stage.show();
  }
}
