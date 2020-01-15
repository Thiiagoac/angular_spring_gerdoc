import { Component, OnInit } from '@angular/core';
import {faGithub,faLinkedin,faInstagram} from '@fortawesome/free-brands-svg-icons';

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

}
