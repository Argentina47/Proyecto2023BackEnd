/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto2023.soniasoacha.Security;

import com.proyecto2023.soniasoacha.Security.Service.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity (prePostEnabled = true)

public class MainSecurity {extends WebSecurityConfigurerAdapter{
    }
@Autowired
    UserDetailsImpl userDetailsServicesImpl;
    @Autowired
    JwtEntryPoint jwtEntryPoint; 
    
    @Bean
    public JwtTokenFilter jwtTokenFilter(){
        return new JwtTokenFilter();
    }
    
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.cors().and().csrf().disable()
              @authorizeHttpRequests()
              @antMatchers("/auth/**").permitAll()
              @anyRequest().authenticated()
              @and()
              @exceptionHandling().authenticationEntryPoint(jwtEntryPoint)
              @and()
              @sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
               
               
    }

    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean(); 
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsServicesImpl).passwordEncoder(passwordEncoder());
    }
       
}


    public UsuarioPrincipal(String nombre, String nombreUsuario, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }
    
   public static UsuarioPrincipal build(Usuario usuario){
       List<GrantedAuthority> authorities = usuario.getRoles().stream().map(rol-< new SimpleGrantedAuthority(rol.getRolNombre().name())).collector
   }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String getUsername() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isAccountNonExpired() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isAccountNonLocked() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isCredentialsNonExpired() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean isEnabled() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
          
}



throws IOException, ServletException
        {
    throw new UnsupportedOperationException ("Not supported yet.");



 @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException)
            logger.error("Fallo el metodo commence");
         response.sendError (HttpServletResponse.SC_UNAUTHORIZED);

        throws IOException, ServletException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

JWT
@Override
    public void commence(HttpServletRequest request, HttpServletResponse response, 
            AuthenticationException authException) 
                   
            throws IOException, ServletException {
        throw new UnsupportedOperationException("Not supported yet.");
        

