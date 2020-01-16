import { Component, OnInit,Input } from '@angular/core';
import { faUserCog,faCogs,faEdit,faSignOutAlt } from '@fortawesome/free-solid-svg-icons';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  faUserCog=faUserCog;
  faCogs=faCogs;
  faEdit=faEdit;
  faSignOutAlt=faSignOutAlt;
  constructor() { }

  ngOnInit() {
  }

  @Input() logado: boolean = false;
  nomeUser : string = "Thiago";

}
