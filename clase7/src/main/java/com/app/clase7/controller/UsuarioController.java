/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.clase7.controller;

import com.app.clase7.entity.Usuario;
import com.app.clase7.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Yasser
 */
@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @GetMapping("/nuevo")
    public String verFormulario(Model model) {
        Usuario nuevoUsuario = new Usuario();
        
        model.addAttribute("usuario", nuevoUsuario);
        
        return "formularioUsuario";
    }
    
    
    @PostMapping("/nuevo")
    public String crearUsuario(@ModelAttribute(name = "usuario") Usuario usuario) {
        usuarioRepository.save(usuario);
        
        return "redirect:/usuarios";
    }
    
    @GetMapping
    public String listadoUsuarios(Model model) {
        
        List<Usuario> listaUsuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", listaUsuarios);
        return "listadoUsuarios";
    }
    
    @GetMapping("/editar/{id}")
    public String editarUsuario(@PathVariable(name = "id") Integer id, Model model) {
        
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        
        if(usuario.isEmpty()) {
            System.out.println("El con id " + id + " no existe");
            return "redirect:/usuarios";
        }
        
        model.addAttribute("usuario", usuario);
        
        return "formularioUsuario";
    }
    
    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable(name = "id") Integer id) {
        
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
        
        if(usuarioOptional.isEmpty()) {
            System.out.println("Eliminación fallido, el usuario con el id " + id + " no existe");
            return "redirect:/usuarios";
        }
        
        Usuario usuario = usuarioOptional.get();
        usuarioRepository.delete(usuario);
        return "redirect:/usuarios";
    }
    

    @GetMapping("/buscar")
    public String listarUsuariosPorNombre(@RequestParam("nombre") String nombre,Model model) {
        
        List<Usuario> listaUsuariosFiltrados = usuarioRepository.findByNombre(nombre);
        model.addAttribute("usuarios", listaUsuariosFiltrados);
        
        return "listadoUsuarios";
    }
    
}
