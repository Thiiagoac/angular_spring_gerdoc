import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenuComponent } from './menu/menu.component';
import { IndexComponent } from './index/index.component';
import { DocumentoComponent } from './form-documento/documento.component';
import { TabledocumentoComponent } from './tabledocumento/tabledocumento.component';


const routes: Routes = [
  {path:'',component:IndexComponent},
  {path:'dashboard/tabledocs' ,component:TabledocumentoComponent},
  {path:'dashboard/document' ,component:DocumentoComponent},
  {path:'dashboard/search' ,component:DocumentoComponent},
  {path:'dashboard' , component:MenuComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
