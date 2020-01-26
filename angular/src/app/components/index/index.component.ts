import { Component, OnInit } from '@angular/core';
import {faGithub,faLinkedin,faInstagram} from '@fortawesome/free-brands-svg-icons';
import { FormGroup, FormControl } from '@angular/forms';
import { stringify } from '@angular/compiler/src/util';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {
  faGithub = faGithub;
  faLinkedin = faLinkedin;
  faInstagram = faInstagram;

  constructor() { }

  ngOnInit() {
  }

  public sendForm = new FormGroup({
    nome: new FormControl(''),
    email: new FormControl(''),
    texto: new FormControl(''),
  });

  onSubmit() {
    let nome = this.sendForm.controls.nome.value;
    let email = this.sendForm.controls.email.value;
    let texto = this.sendForm.controls.texto.value;
    console.log('Nome:', nome,'\nEmail:',email, '\nTexto:', texto);
  }

}
