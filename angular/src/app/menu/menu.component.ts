import { Component, OnInit } from '@angular/core';
import { faSearch , faUserPlus ,faFile} from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  faSearch = faSearch;
  faUserPlus = faUserPlus;
  faFile = faFile;

  logado: boolean = false;
  nome: string = '';

  constructor() {
  }

  ngOnInit() {

    if (this.logado) {
      return this.nome = 'Thiago';
    } else {
      return this.nome = 'Visitante';
    }
  }

  log(){
    console.log('logou')
  }

}
