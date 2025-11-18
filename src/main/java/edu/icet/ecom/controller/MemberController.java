package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.Member;
import edu.icet.ecom.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {
    MemberService memberService = new MemberService();

    @PostMapping("add/member")
    public void addMember(@RequestBody Member member){
        memberService.addMember(member);
    }

    @GetMapping("get/member/{id}")
    public Member getMember(@PathVariable String id){
        return memberService.getMember(id);
    }

    @GetMapping("delete/member/{id}")
    public void deleteMember(@PathVariable String id){
        memberService.deleteMember(id);
    }

    @PostMapping("update/member")
    public void updateMember(@RequestBody Member member){
        memberService.updateMember(member);
    }

    @GetMapping("member/getAll")
    public List<Member> getAll(){
        return memberService.getAll();
    }
}
