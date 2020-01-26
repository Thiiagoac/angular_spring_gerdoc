import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import { AppRoutingModule } from './app-routing.module';
import { MaterialModule } from './module/material.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './components/header/header.component';
import { MenuComponent } from './components/menu/menu.component';
import { IndexComponent } from './components/index/index.component';
import { DocumentoComponent } from './components/form-documento/documento.component';
import { FooterComponent } from './components/footer/footer.component';
import { TabledocumentoComponent } from './components/tabledocumento/tabledocumento.component';

import { CookieService } from 'ngx-cookie-service';
import { LoginService } from './services/login.service';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MenuComponent,
    IndexComponent,
    DocumentoComponent,
    FooterComponent,
    TabledocumentoComponent,
  ],
  imports: [
    FormsModule, 
    ReactiveFormsModule,
    MaterialModule,
    FontAwesomeModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule 
  ],
  providers: [CookieService,LoginService],
  bootstrap: [AppComponent]
})
export class AppModule { }
