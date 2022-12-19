import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/header/header.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { BannerComponent } from './components/banner/banner.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { HysComponent } from './components/hys/hys.component';
import { ProyectosComponent } from './components/proyectos/proyectos.component';
import { FooterComponent } from './components/footer/footer.component';
import { LogoApComponent } from './components/logo-ap/logo-ap.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { interceptorProvider } from './service/interceptor-service';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia/new-experiencia.component';
import { EditExperienciaComponent } from './components/experiencia/edit-experiencia/edit-experiencia.component';
import { NeweducacionComponent } from './components/educacion/neweducacion.component';
import { EditEducacionComponent } from './components/educacion/editeducacion.component';
import { EditSkillComponent } from './components/hys/edit-skill/edit-skill.component';
import { NewSkillComponent } from './components/hys/new-skill/new-skill.component';
import { EditAcercaDeComponent } from './components/acerca-de/edit-acerca-de.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AcercaDeComponent,
    BannerComponent,
    EducacionComponent,
    ExperienciaComponent,
    HysComponent,
    ProyectosComponent,
    FooterComponent,
    LogoApComponent,
    HomeComponent,
    LoginComponent,
    NewExperienciaComponent,
    EditExperienciaComponent,
    NeweducacionComponent,
    EditEducacionComponent,
    EditSkillComponent,
    NewSkillComponent,
    EditAcercaDeComponent
  ],
  imports:[
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    FormsModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,
  ],
  
  providers: [
    interceptorProvider],
    
  bootstrap: [AppComponent]
})
export class AppModule { }
