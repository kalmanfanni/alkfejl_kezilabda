import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { JegyvasarlasComponent } from './jegyvasarlas.component';

describe('JegyvasarlasComponent', () => {
  let component: JegyvasarlasComponent;
  let fixture: ComponentFixture<JegyvasarlasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ JegyvasarlasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(JegyvasarlasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
