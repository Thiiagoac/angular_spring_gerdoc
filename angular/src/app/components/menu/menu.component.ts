import { Component, OnInit } from '@angular/core';
import { faSearch , faUserPlus ,faFile} from '@fortawesome/free-solid-svg-icons';
import { CookieService } from 'ngx-cookie-service';
import { HeaderComponent} from 'src/app/components/header/header.component';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  faSearch = faSearch;
  faUserPlus = faUserPlus;
  faFile = faFile;

  
  constructor(public cookieService : CookieService) {
  }
  head : HeaderComponent;
  logado: boolean = true;
  nome: string = this.cookieService.get('emailUser').split('@')[0];;
  
  ngOnInit() {
  }

  log(){
    console.log('logou')
  }

}
