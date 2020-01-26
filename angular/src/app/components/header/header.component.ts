import { Component, OnInit, Input } from '@angular/core';
import { faUserCog, faCogs, faEdit, faSignOutAlt } from '@fortawesome/free-solid-svg-icons';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';
import { FormGroup, FormControl } from '@angular/forms';
import { User } from 'src/app/model/User';
import { CookieService } from 'ngx-cookie-service';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  faUserCog = faUserCog;
  faCogs = faCogs;
  faEdit = faEdit;
  faSignOutAlt = faSignOutAlt;

  public logado: boolean = false;
  public nomeUser: string = null;

  constructor(public route: Router, public serviceLogin: LoginService, public cookieService : CookieService) { }

  public loginForm = new FormGroup({
    email: new FormControl(''),
    senha: new FormControl(''),
  });

  ngOnInit() {
  }
  
  getStatusLogado(){
    return this.logado;
  }

  onSubmit() {
    var user = new User();
    user.email = this.loginForm.controls.email.value;
    user.senha = this.loginForm.controls.senha.value;
    this.serviceLogin.postAuthentication(user.email, user.senha)
      .subscribe(response => {
        if (response.body != null) {
          this.route.navigate(['dashboard']);
          this.nomeUser = this.cookieService.get('emailUser').split('@')[0];
          console.log(this.nomeUser);
          this.logado = true;
        }
      });
  }

}
