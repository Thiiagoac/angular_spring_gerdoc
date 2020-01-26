import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { MenuComponent } from './components/menu/menu.component';
import { IndexComponent } from './components/index/index.component';
import { DocumentoComponent } from './components/form-documento/documento.component';
import { TabledocumentoComponent } from './components/tabledocumento/tabledocumento.component';


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
