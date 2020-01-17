import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FontAwesomeModule} from '@fortawesome/angular-fontawesome';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HeaderComponent } from './header/header.component';
import { MenuComponent } from './menu/menu.component';
import { IndexComponent } from './index/index.component';
import { DocumentoComponent } from './form-documento/documento.component';
import { MaterialModule } from './modules/material.module';
import { FooterComponent } from './footer/footer.component';
import { TabledocumentoComponent } from './tabledocumento/tabledocumento.component';

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
    MaterialModule,
    FontAwesomeModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
