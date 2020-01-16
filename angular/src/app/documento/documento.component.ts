import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-documento',
  templateUrl: './documento.component.html',
  styleUrls: ['./documento.component.css']
})
export class DocumentoComponent implements OnInit {



  constructor(public router: Router) { }

  public addDocForm = new FormGroup({
    name: new FormControl(''),
    crm: new FormControl(''),
    email: new FormControl(''),
    password: new FormControl(''),
  });

  ngOnInit() {
  }

  Voltar() {
    this.router.navigate(['dashboard']);
  }
  onSubmit() {
    console.log('test')
  }


}
